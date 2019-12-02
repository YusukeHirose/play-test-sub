package repositories.Impl;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import models.DatabaseExecutionContext;
import models.db.User;
import play.db.jpa.JPAApi;
import repositories.RepositoryBase;
import repositories.UserRepository;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/** @author hiroseyusuke */
public class JPAUserRepository extends RepositoryBase implements UserRepository {

  @Inject
  public JPAUserRepository(JPAApi jpaApi, DatabaseExecutionContext databaseExecutionContext) {
    super(jpaApi, databaseExecutionContext);
  }

  @Override
  public CompletionStage<Stream<User>> getAll() {
    return supplyAsync(() -> wrap(this::getAll), executionContext);
  }

  private Stream<User> getAll(EntityManager entityManager) {
    List<User> users =
        entityManager.createQuery("select u from User u", User.class).getResultList();
    return users.stream();
  }
}
