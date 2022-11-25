#!/usr/bin/env groovy
def call(String clr = "#439FE0", String msg = "Build Successful") {
  slackSend color:${clr}, message:${msg} 
}
