package Exception;

import java.security.cert.CertificateException;

public class BusinessException extends CertificateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}
}
