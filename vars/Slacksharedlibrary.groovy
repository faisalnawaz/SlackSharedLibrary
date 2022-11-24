#!/usr/bin/env groovy
def call(String cmnd = "slackSend", String clr = "#439FE0", String msg = "Build Successful") {
  echo "${cmnd} color: ${clr}, message: ${msg}"
}
