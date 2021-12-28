package lex.example.sinhronisationUKMtoBI.repository.bi;

import lex.example.sinhronisationUKMtoBI.composit.bi.CashierReceiptId;
import lex.example.sinhronisationUKMtoBI.entity.bi.CashierReceipt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashierReceiptRepo extends CrudRepository<CashierReceipt, CashierReceiptId> {
}
