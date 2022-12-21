package com.modu.modutranslate.external

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "naverFeignClient", url = "")
interface NaverFeignClient {


}