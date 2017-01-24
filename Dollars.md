# Dollars methods

In an object algebra, a `$` method is generated by abstract type of the interface.

The job of a `$` method is to dispatch a model's instance to the relevant object algebra method using `typeof` identification and downcasting.

This work since we can make the hypothesis that we know every children of a given type parameter root. If a `$` method receives an unknown children instance in parameter, an algebra should have been generated and implemented for it.