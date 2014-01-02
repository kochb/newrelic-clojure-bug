NewRelic & Clojure
==================

This app demonstrates a regression introduced in the New Relic Java notifier version 3.2.0.  It causes no data to be reported to the dashboard.

Configuration
-------------

1. Install [leiningen](https://github.com/technomancy/leiningen#installation).
2. Create a test app with newrelic.
3. Set the appropriate environment variables:

    export NEW_RELIC_APP_NAME=clojure-test-zo58
    export NEW_RELIC_LICENSE_KEY=325cea33a1027bd260b58d2de3fe49b04ee9ab67

To Reproduce
------------

Check out the v3.1.1 branch.

    get checkout newrelic-3.1.1
    lein run
    wget localhost:8000

You should get a successful response, and new relic should report the request to the dashboard.

Check out the v3.2.0 branch.

    git checkout newrelic-3.2.0
    lein run
    wget localhost:8000

You should get a successful response, but data will not be reported to new relic for this request.

