package models;

import javax.inject.Inject;

import akka.actor.ActorSystem;
import play.libs.concurrent.CustomExecutionContext;

/** @author hiroseyusuke */
public class DatabaseExecutionContext extends CustomExecutionContext {

  @Inject
  public DatabaseExecutionContext(ActorSystem actorSystem, String name) {
    super(actorSystem, "database.dispatcher");
  }
}
