package customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    AccountFeignClient accountClient;
    @RequestMapping("/account/{customerId}")
    public Account getName(@PathVariable String customerId) {
        return accountClient.getName(customerId);
    }

    @FeignClient(name = "account-service", url = "http://localhost:8090")
    public interface AccountFeignClient {
        @RequestMapping("/account/{customerId}")
        public Account getName(@PathVariable String customerId);
    }
}
