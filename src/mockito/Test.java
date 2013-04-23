package mockito;

import static org.mockito.Mockito.*;
import java.util.List;

public class Test {

	
	@SuppressWarnings("unchecked")
	public void teste1(){
		List<String> mock = mock(List.class);
		
		mock.add("teste");
		mock.clear();
		
		verify(mock).add("teste");
		verify(mock).clear();
	}

	
	@SuppressWarnings("unchecked")
	public void teste2(){
		List<String> mock = mock(List.class);
		when(mock.get(0)).thenReturn("1");
		
		System.out.println(mock.get(0));
	}
	
	public static void main(String[] args) {
//		new Test().teste();
		new Test().teste2();
	}
}
