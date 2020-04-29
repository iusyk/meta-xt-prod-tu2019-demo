DESCRIPTION = "Go client for AMQP 0.9.1."

GO_IMPORT = "github.com/streadway/amqp"

inherit go

SRC_URI = "git://${GO_IMPORT};protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "1c71cc93ed716f9a6f4c2ae8955c25f9176d9f19"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=29358571796140f6172846eac9be80d2"
PTEST_ENABLED = ""

FILES_${PN} += "${GOBIN_FINAL}/*"

do_compile[noexec] = "1"
