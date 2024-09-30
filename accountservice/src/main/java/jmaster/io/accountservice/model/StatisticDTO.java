package jmaster.io.accountservice.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatisticDTO {
    @NotNull
    private String message;
    @NotNull
    private Date createdDate;
}
