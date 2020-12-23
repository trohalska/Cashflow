package world.ucode.cashflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import world.ucode.cashflow.models.Wallet;
import world.ucode.cashflow.repositories.WalletRepo;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    WalletRepo walletRepo;
    @GetMapping
    public List<Wallet> getMain(HttpServletResponse response) throws IOException {
        response.encodeRedirectURL("main");
        return walletRepo.findByUser_Id(1);
    }
}