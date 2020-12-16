package world.ucode.cashflow.repositories;

import org.springframework.data.repository.CrudRepository;
import world.ucode.cashflow.models.Category;
import world.ucode.cashflow.models.Message;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}