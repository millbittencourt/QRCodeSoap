package qrCodeSoap;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.google.zxing.WriterException;


@WebService
@SOAPBinding(style = Style.RPC)
public interface QrCodeInterface {
	
	@WebMethod String generateQRCodeImage(String link) throws WriterException, IOException;
	
}
