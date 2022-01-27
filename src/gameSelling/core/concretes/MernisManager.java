package gameSelling.core.concretes;

import gameSelling.core.abstracts.MernisService;
import java.rmi.RemoteException;
import gameSelling.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoap proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.valueOf(customer.getIdentityNumber()).longValue(),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getYearOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {

			return false;
		}

	}

}