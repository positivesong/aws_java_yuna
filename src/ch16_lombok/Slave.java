package ch16_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@ToString
//@Setter
//@Getter
//@EqualsAndHashCode
@Data
// 위에 Data를 쓰면 주석을 한번에 적용
public class Slave {
	private final String name;
	private int age;
}
