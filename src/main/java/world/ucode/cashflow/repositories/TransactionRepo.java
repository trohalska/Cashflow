package world.ucode.cashflow.repositories;

import org.springframework.data.repository.CrudRepository;
import world.ucode.cashflow.models.Message;

public interface TransactionRepo extends CrudRepository<Message, Long> {
}
