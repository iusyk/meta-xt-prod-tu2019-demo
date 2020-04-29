DESCRIPTION = "github.com/opencontainers/runc/"

GO_IMPORT = "github.com/opencontainers/runc/"

inherit go

export CGO_ENABLED="1"

SRC_URI = "git://${GO_IMPORT};protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "80e2d1f1453d5f09da7633c57d831ef7167cae5d"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=435b266b3899aa8a959f17d41c56def8"

RDEPENDS_${PN}-dev += "bash"
CGO_ENABLED = "1"
FILES_${PN} += "${GOBIN_FINAL}/*"
