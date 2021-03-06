package homedoctor.medicine.api.dto.receiver;

import homedoctor.medicine.domain.AlarmStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
@AllArgsConstructor @Getter @Builder
public class createReceiverAlarmRequest {

    private String title;

    private Long label;

    private Date startDate;

    private Date endDate;

    private String times;

    private String repeats;

    private AlarmStatus alarmStatus;

    public final boolean validProperties() {
        if (title != null && label != null &&
                startDate != null && endDate != null && times != null &&
                repeats != null && alarmStatus != null) {
            return true;
        }
        return false;
    }

}
