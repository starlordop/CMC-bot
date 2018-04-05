package at.chaoticbits.render

import at.chaoticbits.coinmarket.TestData
import org.testng.Assert
import org.testng.annotations.Test

import java.io.InputStream

class HtmlServiceTest {


    @Test
    fun testGenerateCryptoDetailsImage() {

        TestData.currencyDetails().forEach {
            val image = HtmlImageService.generateCryptoDetailsImage(it)
            Assert.assertNotNull(image)
        }

    }


}
