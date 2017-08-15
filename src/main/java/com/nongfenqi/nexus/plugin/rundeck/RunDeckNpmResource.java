package com.nongfenqi.nexus.plugin.rundeck;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;

import org.sonatype.goodies.common.ComponentSupport;
import org.sonatype.nexus.repository.manager.RepositoryManager;
import org.sonatype.nexus.repository.search.SearchService;
import org.sonatype.nexus.rest.Resource;

import static com.google.common.base.Preconditions.*;

@Named
@Singleton
@Path("/rundeck/npm/options")
public class RunDeckNpmResource
    extends ComponentSupport
    implements Resource
{
  private final SearchService searchService;
  private final RepositoryManager repositoryManager;

  @Inject
  public RunDeckNpmResource(final SearchService searchService,
                                 final RepositoryManager repositoryManager)
  {
    this.searchService = checkNotNull(searchService);
    this.repositoryManager = checkNotNull(repositoryManager);
  }


}
