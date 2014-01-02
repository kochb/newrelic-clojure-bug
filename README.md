NewRelic & Clojure
==================

This app demonstrates a regression in the New Relic Java notifier which causes no data to be reported to the dashboard.  This issue was introduced in version 3.2.0, and tests indicate it still exists in the most recent version 3.2.3.

Configuration
-------------

1. Install [leiningen](https://github.com/technomancy/leiningen#installation).
2. Create a test app with newrelic.
3. Set the appropriate environment variables:

```bash
export NEW_RELIC_APP_NAME=clojure-test-zo58
export NEW_RELIC_LICENSE_KEY=325cea33a1027bd260b58d2de3fe49b04ee9ab67
```

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

To test other versions of the notifier, edit project.clj and change the version number, ie:

    :java-agents [[com.newrelic.agent.java/newrelic-agent "3.2.3"]]

What caused the regression?
---------------------------

Dunno.  This is something New Relic will need to look into.

