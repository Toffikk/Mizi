## Overview

Mizi is a fork of [Folia](https://github.com/PaperMC/Folia) containing performance patches from [Pufferfish](https://github.com/pufferfish-gg/Pufferfish) and [Lithium](https://github.com/CaffeineMC/lithium-fabric) and some patches from [Purpur](https://github.com/PurpurMC/Purpur) that I use on my server.

This fork is made for my own personal server and I **do not** guarantee any stability and I don't encourage you to use it for the performance gains but you're free to do whatever you want.

**And it's important to keep in mind that mixing different patches together is *more likely than not* to cause unexpected issues**

Especially since this fork removes folia's safeguard against loading *potentially* unsafe plugins (plugins that aren't thread-safe and use the main thread) so if you intend to use plugins on this fork **make sure** that it will work on folia.

```markdown
There is no more main thread. I expect _every_ single plugin
that exists to require _some_ level of modification to function
in Folia. Additionally, multithreading of _any kind_ introduces
possible race conditions in plugin held data - so, there are bound
to be changes that need to be made.

So, have your expectations for compatibility at 0.
```

## FAQ

#### How to download builds?
Builds are available to download through Github Actions.

#### Any questions about Folia's designs, limitations or other things? 
[visit folia's readme](https://github.com/PaperMC/Folia/blob/master/README.md)


## License
The PATCHES-LICENSE file describes the license for api & server patches made by SpottedLeaf (from folia),
all other patches are subject to their original licenses stated in the original patches and/or the projects' licenses that they were taken from.

The fork is based off of PaperMC's fork example found [here](https://github.com/PaperMC/paperweight-examples).
As such, it contains modifications to it in this project, please see the repository for license information
of modified files.
