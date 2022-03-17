package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name = "bankWS")
public class BankService {
    @WebMethod(operationName = "conversionDHToEuro")
    public double conversion(@WebParam(name = "amount") double amount){
        return amount * 11;
    }

    public Account getAccount(@WebParam(name = "accountId") Long id){
        return  new Account(id,Math.random()*8000,new Date(), true);
    }

    public List<Account> getAccounts(){
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            accounts.add(new Account((long) (i + 1),Math.random()*8000,new Date(), true));
        }
      return accounts;
    }
}
