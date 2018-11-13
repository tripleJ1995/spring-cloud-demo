package cn.j.entity;

import java.math.BigDecimal;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductOrder {
    @Id
    private Integer id;

    private Integer customerId;

    private Integer businessId;

    private BigDecimal amount;

    private Byte payStatus;
}