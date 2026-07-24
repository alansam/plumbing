# plumbing
NetRexx Pipelines (an implementation in NetRexx of IBM's CMS/Hartmann Pipelines).
This repository contains a collection of experiments and tests.

## Introduction
Taken from the preamble of the *NetRexx Pipelines Guide and Reference*

A Pipeline, or Hartmann Pipeline, is a concept that extends and improves pipes
as they are known from Unix and other operating systems. The name pipe indicates
an interprocess communication mechanism, as well as the programming paradigm
it has introduced. Compared to Unix pipes, Hartmann Pipelines offer multiple
input- and output streams, more complex pipe topologies, and a lot more.
Pipelines were first implemented on VM/CMS, one of IBM’s mainframe operating
systems. This version was later adapted to run under MUSIC/SP and TSO/MVS
(now z/OS) and has been part of several product configurations. Pipelines are
widely used by VM users, in a symbiotic relationship with REXX, the interpreted
language that also has its origins on this platform.

Pipes for NetRexx is the implementation of Pipelines for the Java Virtual machine.
It is written in NetRexx and pipes and stages can be defined using this language.
It can run on every platform that has a JVM (Java Virtual Machine) installed. This
portable version of Pipelines was started by Ed Tomlinson in 1997 under the name
of njPipes, when NetRexx was still very new, and was open sourced in 2011, soon
after the NetRexx translator itself. The included stages have always been open
source. It was integrated into the NetRexx translator in 2014 and first released
with version 3.04.

In version 3.08, there are important improvements that enable pipelines to be run
from the command line, and from the NetRexx REPL program nrws, the NetRexx
Workspace. The pipes compiler has been renamed pipc, while the pipes runner
component keeps using the name pipe.
