package com.eigengo.lift.profile

import com.eigengo.lift.common.MicroserviceApp

object UserProfileMicroservice extends MicroserviceApp(0)(UserProfileBoot.boot)