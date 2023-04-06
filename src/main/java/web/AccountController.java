package web;

import model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    private Map<String, Account> db = new HashMap<>(){{
        put("1", new Account(1000, "Adalberto", "Santos", 255745279, 425306020,
                42049631, "Bank of America" ));
    }};

    /*
        private List<Account> db = List.of(new Account("Adalberto", "Santos", 255745279, 425306020,
                42049631, "Bank of America" ));
    */
    public AccountController() {
        this.db = db;
    }

    @GetMapping("/")
    public String hello(){
        return "Olá";
    }
    /*
    @GetMapping("/accounts")
    public List<Account> get() {
        return db.values();
    }
*/
    @GetMapping("/accounts")
    public Collection<Account> get() {
        return db.values();
    }
    @GetMapping("/account/{id}")
    public Account get(@PathVariable String id) {
        Account account = db.get(id);
        if ( account == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return account;
    }


    @DeleteMapping("/account/{id}")
    public void delete(@PathVariable String id) {
        Account account = db.remove(id);
        if ( account == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

    }


}
