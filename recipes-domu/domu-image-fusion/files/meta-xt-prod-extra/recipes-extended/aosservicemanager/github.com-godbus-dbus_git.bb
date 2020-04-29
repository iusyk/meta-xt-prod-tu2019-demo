DESCRIPTION = "Native Go bindings for D-Bus"

GO_IMPORT = "github.com/godbus/dbus"

inherit go

SRC_URI = "git://${GO_IMPORT};protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "a81f0b52152ffcc4c163b8f13a2609b989e23028"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed"
PTEST_ENABLED = ""

FILES_${PN} += "${GOBIN_FINAL}/*"

do_compile[noexec] = "1"
