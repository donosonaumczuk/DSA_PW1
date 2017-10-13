package BackEnd;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class SHA256 implements HashFunction, java.io.Serializable{

    public String hashData(String data) {
        String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private String bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }
}