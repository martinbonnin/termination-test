# termination-test

Test repo for https://github.com/apollographql/apollo-android/issues/3619

Run

```
$ ./gradlew run

> Task :run
com.apollographql.apollo3.exception.ApolloHttpException: Http request failed with status code `405 (<!DOCTYPE html>
<html lang=en>
  <meta charset=utf-8>
  <meta name=viewport content="initial-scale=1, minimum-scale=1, width=device-width">
  <title>Error 405 (Method Not Allowed)!!1</title>
  <style>
    *{margin:0;padding:0}html,code{font:15px/22px arial,sans-serif}html{background:#fff;color:#222;padding:15px}body{margin:7% auto 0;max-width:390px;min-height:180px;padding:30px 0 15px}* > body{background:url(//www.google.com/images/errors/robot.png) 100% 5px no-repeat;padding-right:205px}p{margin:11px 0 22px;overflow:hidden}ins{color:#777;text-decoration:none}a img{border:0}@media screen and (max-width:772px){body{background:none;margin-top:0;max-width:none;padding-right:0}}#logo{background:url(//www.google.com/images/branding/googlelogo/1x/googlelogo_color_150x54dp.png) no-repeat;margin-left:-5px}@media only screen and (min-resolution:192dpi){#logo{background:url(//www.google.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png) no-repeat 0% 0%/100% 100%;-moz-border-image:url(//www.google.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png) 0}}@media only screen and (-webkit-min-device-pixel-ratio:2){#logo{background:url(//www.google.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png) no-repeat;-webkit-background-size:100% 100%}}#logo{display:inline-block;height:54px;width:150px}
  </style>
  <a href=//www.google.com/><span id=logo aria-label=Google></span></a>
  <p><b>405.</b> <ins>That’s an error.</ins>
  <p>The request method <code>POST</code> is inappropriate for the URL <code>/</code>.  <ins>That’s all we know.</ins>
)`
        at com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.invokeSuspend(HttpNetworkTransport.kt:103)
        at com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.invoke(HttpNetworkTransport.kt)
        at com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.invoke(HttpNetworkTransport.kt)
        at kotlinx.coroutines.flow.SafeFlow.collectSafely(Builders.kt:61)
        at kotlinx.coroutines.flow.AbstractFlow.collect(Flow.kt:212)
        at kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl.flowCollect(ChannelFlow.kt:195)
        at kotlinx.coroutines.flow.internal.ChannelFlowOperator.collectTo$suspendImpl(ChannelFlow.kt:157)
        at kotlinx.coroutines.flow.internal.ChannelFlowOperator.collectTo(ChannelFlow.kt)
        at kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1.invokeSuspend(ChannelFlow.kt:60)
        at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
        at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
        at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:571)
        at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:750)
        at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:678)
        at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:665)
done

```
