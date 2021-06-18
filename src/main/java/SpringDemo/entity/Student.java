package SpringDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@ToString
@Entity
@NoArgsConstructor
@Getter
@Table(name = "data")
public class Student {

    @Id
    private int id;
    private String name;
    private String city;


}