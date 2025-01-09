package individuals.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "addresses", schema = "person")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "address", nullable = false, length = 128)
    private String address;

    @Column(name = "zip_code", length = 32)
    private String zipCode;

    @Column(name = "city", nullable = false, length = 32)
    private String city;

    @Column(name = "state", length = 32)
    private String state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private CountryEntity country;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "updated", nullable = false)
    private LocalDateTime updated;

    @Column(name = "archived")
    private LocalDateTime archived;
}