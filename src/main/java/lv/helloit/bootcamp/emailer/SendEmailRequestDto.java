package lv.helloit.bootcamp.emailer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendEmailRequestDto {
    private String emailTo;
    private String subject;
    private String content;

}
