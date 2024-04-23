# (23) Testing in CI/CD Pipeline

## Apa itu Continuos Integration (CI)?
CI is the practice of integrating code into a shared repository and building/testing each change automatically, as early as possible - usually several times a day

### Kelebihan CI
- Decoupled stages -> single focoused task
- Repeatable
- Fail Fast

### Benefit Mengimplementasikan CI
- Detecting bug in early stage
- Reduces bug count
- Development process more transparant
- Efficient

## Apa itu Continous Delivery / Development (CD)?
- Continous Delivery adds that the software can be relesed to production at any time, often by automatically pushing changes to a staging system

- Continous Deployment goes further and pushes changes to production automatically

### Kelebihan CD
- Design with system in mind
- Pipelines
- Globally unique versions

### Benefit Mengimplementasikan CD
- Reduce the risk
- Painless deployment
- Reduces costs
- Automated and transparent process
- Releases more frequently

## CI/CD Process
1. Commit
2. Build
3. Test
4. Deploy

## CI/CD Tools
- Jenkins
- Bamboo
- cicleci
- AWS CodeBuild
- Azure DevOps
- Gitlab CI
- Travis CI
- Github Actions


## Components of GitHub Actions
1. Workflows -> configurable automated process that will run one or more jobs
2. Jobs -> specific activity in a repository that trigger a workflow run
3. Actions -> Costum application for the Github Actions platform that performs a complex but frequently repeated task
4. Events -> set of steps in a workflow that execute on the same runner
5. Runner -> server that run your workflow when they're triggered