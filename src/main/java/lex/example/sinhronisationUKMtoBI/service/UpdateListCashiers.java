package lex.example.sinhronisationUKMtoBI.service;

import lex.example.sinhronisationUKMtoBI.entity.bi.CashierReceipt;
import lex.example.sinhronisationUKMtoBI.entity.ukm.TrmInUsers;
import lex.example.sinhronisationUKMtoBI.repository.bi.CashierReceiptRepo;
import lex.example.sinhronisationUKMtoBI.repository.ukm.TrmInUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpdateListCashiers {
    @Autowired
    CashierReceiptRepo cashierBiRepo;
    @Autowired
    TrmInUsersRepo trmInUsersRepo;

    @Scheduled(fixedRate = 3600000)
    public void  updatelist(){
        Iterable<TrmInUsers> trmInUsers = trmInUsersRepo.findAll();
        List<TrmInUsers> trmInUsersList =new ArrayList<>();
        List<CashierReceipt> cashierReceiptList = new ArrayList<>();
        for (TrmInUsers users:
                trmInUsers) {
            trmInUsersList.add(users);
            cashierReceiptList.add(new CashierReceipt(
                    users.getStoreId(),
                    users.getId(),
                    users.getName(),
                    users.getUserInn(),
                    users.getRoleId()
            ));
        }

        cashierBiRepo.saveAll(cashierReceiptList);
    }


}
