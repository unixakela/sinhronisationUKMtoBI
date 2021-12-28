package lex.example.sinhronisationUKMtoBI.controllers;

import lex.example.sinhronisationUKMtoBI.composit.bi.CashierReceiptId;
import lex.example.sinhronisationUKMtoBI.entity.bi.CashierReceipt;
import lex.example.sinhronisationUKMtoBI.entity.ukm.TrmInUsers;
import lex.example.sinhronisationUKMtoBI.repository.bi.CashierReceiptRepo;
import lex.example.sinhronisationUKMtoBI.repository.ukm.TrmInUsersRepo;
import lex.example.sinhronisationUKMtoBI.service.UpdateListCashiers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class RootController {
    @Autowired
    public TrmInUsersRepo trmInUsersRepo;
    @Autowired
    public CashierReceiptRepo cashierReceiptRepo;

    @GetMapping("/update")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        //viewPage(model);
        return "update";
    }
    @RequestMapping(value = "/update", params = "btn_update", method = RequestMethod.POST)
    public String refreshAction(Model model) {
        Iterable<TrmInUsers> trmInUsers = trmInUsersRepo.findAll();
        List<TrmInUsers> trmInUsersList =new ArrayList<>();
    //    List<CashierReceipt> cashierReceiptList = new ArrayList<>();
        for (TrmInUsers users:
             trmInUsers) {
            trmInUsersList.add(users);
     /*       cashierReceiptList.add(new CashierReceipt(
                    users.getStoreId(),
                    users.getId(),
                    users.getName(),
                    users.getUserInn(),
                    users.getRoleId()
            ));*/
        }

  //      cashierReceiptRepo.saveAll(cashierReceiptList);*/




        model.addAttribute("trmInUsersList", trmInUsersList);
        return  "update";
    }

}
