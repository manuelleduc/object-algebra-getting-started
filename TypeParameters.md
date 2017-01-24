# Type Parameters

Once understood the type parameter definition process is easy to follow but a more advanced explanation is needed for education and documentation.

## Rule

The following rules are expressed in term of EMF vocabulary but can easily be ported to any object oriented structured format.

## Type generation

In a given model, a type parameter root is defined for each EClass directly defined in the model (e.g. not for the cross-referenced elements) with either:

- No explicit parent (e.g. a single implicit inheritance to EObject)
- Explicitly annotated with `OARoot`. 

Every children of a type parameter root inherits from the same type parameter in the generated Object Algebra.

If a given EClass inherits from two roots, the model is **ambiguous** and no object algebra can be defined.

Two solutions can be considered :

- Adding a common parent to both root, which will become the new type parameter root of the hierarchy.
- Transforming the ambiguous element to a new type parameter root by adding a `OARoot` annotation to it.

At the end of the process a type parameter is generated for each identified type parameter root.