package peaksoft.example.oneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "passport")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String number;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "passport")
    private User user;


}
