# kotlin-js-seed
starter project with gradle, continuous build and kotlin-js

uses:
- kotlin-frontend-plugin
- kotlinx-html to generate html content

To run, simply run './gradlew -t run'

This launches gradle in continous mode (-t), compiles all kotlin to js, 
an launches webpack to serve an reload the webpage when anything changes

