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

## Implementation choices

The previously defined rules are based on our experimentations with the object algebra definition process.

We also tried to defined a single type parameter by generated object algebra but it lacked expressibility since many subparts of a model does not have the same meaning at the semantics level.

In the other hand we tried to define a type parameter by element in the model. But it generated an awful lot of type parameters which leads to unmaintainable source code, especially in case of code reuse and object algebra inheritance.

The `OARoot` has been introduce for two reasons.

The first has been introduced previously. It offers the possibility to remove multiple inheritance ambiguity from the model.

It also allow a model designer to explicitly specialize some subparts of a class hierarchy if the parent is too generic. A common pattern is the definition of a `NamedElement` EClass with a single `name:EString` field. Is is useful but does not have nothing to do with the meaning of its children. In this case the model design can use `OARoot` to force the direct children of `NamedElement` to be type parameters root of the object algebra.