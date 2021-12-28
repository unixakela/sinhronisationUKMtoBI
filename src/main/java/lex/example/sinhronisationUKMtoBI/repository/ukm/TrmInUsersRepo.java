package lex.example.sinhronisationUKMtoBI.repository.ukm;

import lex.example.sinhronisationUKMtoBI.composit.ukm.TrmInUsersId;
import lex.example.sinhronisationUKMtoBI.entity.ukm.TrmInUsers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrmInUsersRepo extends CrudRepository<TrmInUsers, TrmInUsersId> {
}
