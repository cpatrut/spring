package ro.catalin.service;

public class LogginService {

	public boolean authenticate(String userId, String password) {
		if (password == null ) {
			return false;
		} else {
			return true;

		}
	}
}
