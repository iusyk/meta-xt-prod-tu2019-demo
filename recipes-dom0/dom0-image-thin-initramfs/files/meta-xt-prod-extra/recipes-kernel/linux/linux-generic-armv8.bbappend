FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

BRANCH = "master"
SRCREV = "79b42d9fbd28b13d882a8c60b7e89b497662ae96"
LINUX_VERSION = "4.14.75"

SRC_URI = " \
    git://github.com/xen-troops/linux.git;branch=${BRANCH} \
    file://defconfig \
  "
do_deploy_append () {
    find ${D}/boot -iname "vmlinux*" -exec tar -cJvf ${STAGING_KERNEL_BUILDDIR}/vmlinux.tar.xz {} \;
}
