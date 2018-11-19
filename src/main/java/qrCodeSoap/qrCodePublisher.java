package qrCodeSoap;

import javax.xml.ws.Endpoint;

public class qrCodePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8088/qrCodeSoap", new QrCodeController());
	}

}
