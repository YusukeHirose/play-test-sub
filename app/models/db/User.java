package models.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** @author hiroseyusuke */
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long Id;

  public String name;

  public String mailAddress;

  public String imageUrl;

  public Long postId;

  public String token;
}
