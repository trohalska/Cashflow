package world.ucode.cashflow.repositories;

import org.springframework.data.repository.CrudRepository;
import world.ucode.cashflow.models.Message;
import world.ucode.cashflow.models.Tag;

public interface TagRepo extends CrudRepository<Tag, Long> {
}