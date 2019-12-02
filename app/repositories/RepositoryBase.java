package repositories;

import java.util.function.Function;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import models.DatabaseExecutionContext;
import play.db.jpa.JPAApi;

/** @author hiroseyusuke */
public abstract class RepositoryBase {

  protected final JPAApi jpaApi;
  protected final DatabaseExecutionContext executionContext;

  @Inject
  public RepositoryBase(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
    this.jpaApi = jpaApi;
    this.executionContext = executionContext;
  }

  protected <T> T wrap(Function<EntityManager, T> function) {
    return jpaApi.withTransaction(function);
  }
}
