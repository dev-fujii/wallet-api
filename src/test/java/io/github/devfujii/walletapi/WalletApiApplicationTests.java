package io.github.devfujii.walletapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class WalletApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
