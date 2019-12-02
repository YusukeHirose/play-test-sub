package repositories;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import com.google.inject.ImplementedBy;
import models.db.User;
import repositories.Impl.JPAUserRepository;

/** @author hiroseyusuke */
@ImplementedBy(JPAUserRepository.class)
public interface UserRepository {

  CompletionStage<Stream<User>> getAll();
}
