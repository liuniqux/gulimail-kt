plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "gulimail"
include(
    "gulimail-product",
    "gulimail-ware",
    "gulimail-order",
    "gulimail-coupon",
    "gulimail-member",
    "gulimail-common"
)
