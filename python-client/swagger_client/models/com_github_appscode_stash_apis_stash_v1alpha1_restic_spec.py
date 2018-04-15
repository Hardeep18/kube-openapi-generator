# coding: utf-8

"""
    stash-server

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_backend import ComGithubAppscodeStashApisStashV1alpha1Backend  # noqa: F401,E501
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_file_group import ComGithubAppscodeStashApisStashV1alpha1FileGroup  # noqa: F401,E501
from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_retention_policy import ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy  # noqa: F401,E501
from swagger_client.models.io_k8s_api_core_v1_local_object_reference import IoK8sApiCoreV1LocalObjectReference  # noqa: F401,E501
from swagger_client.models.io_k8s_api_core_v1_resource_requirements import IoK8sApiCoreV1ResourceRequirements  # noqa: F401,E501
from swagger_client.models.io_k8s_api_core_v1_volume_mount import IoK8sApiCoreV1VolumeMount  # noqa: F401,E501
from swagger_client.models.io_k8s_apimachinery_pkg_apis_meta_v1_label_selector import IoK8sApimachineryPkgApisMetaV1LabelSelector  # noqa: F401,E501


class ComGithubAppscodeStashApisStashV1alpha1ResticSpec(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'backend': 'ComGithubAppscodeStashApisStashV1alpha1Backend',
        'file_groups': 'list[ComGithubAppscodeStashApisStashV1alpha1FileGroup]',
        'image_pull_secrets': 'list[IoK8sApiCoreV1LocalObjectReference]',
        'paused': 'bool',
        'resources': 'IoK8sApiCoreV1ResourceRequirements',
        'retention_policies': 'list[ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy]',
        'schedule': 'str',
        'selector': 'IoK8sApimachineryPkgApisMetaV1LabelSelector',
        'type': 'str',
        'volume_mounts': 'list[IoK8sApiCoreV1VolumeMount]'
    }

    attribute_map = {
        'backend': 'backend',
        'file_groups': 'fileGroups',
        'image_pull_secrets': 'imagePullSecrets',
        'paused': 'paused',
        'resources': 'resources',
        'retention_policies': 'retentionPolicies',
        'schedule': 'schedule',
        'selector': 'selector',
        'type': 'type',
        'volume_mounts': 'volumeMounts'
    }

    def __init__(self, backend=None, file_groups=None, image_pull_secrets=None, paused=None, resources=None, retention_policies=None, schedule=None, selector=None, type=None, volume_mounts=None):  # noqa: E501
        """ComGithubAppscodeStashApisStashV1alpha1ResticSpec - a model defined in Swagger"""  # noqa: E501

        self._backend = None
        self._file_groups = None
        self._image_pull_secrets = None
        self._paused = None
        self._resources = None
        self._retention_policies = None
        self._schedule = None
        self._selector = None
        self._type = None
        self._volume_mounts = None
        self.discriminator = None

        if backend is not None:
            self.backend = backend
        if file_groups is not None:
            self.file_groups = file_groups
        if image_pull_secrets is not None:
            self.image_pull_secrets = image_pull_secrets
        if paused is not None:
            self.paused = paused
        if resources is not None:
            self.resources = resources
        if retention_policies is not None:
            self.retention_policies = retention_policies
        if schedule is not None:
            self.schedule = schedule
        if selector is not None:
            self.selector = selector
        if type is not None:
            self.type = type
        if volume_mounts is not None:
            self.volume_mounts = volume_mounts

    @property
    def backend(self):
        """Gets the backend of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501


        :return: The backend of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: ComGithubAppscodeStashApisStashV1alpha1Backend
        """
        return self._backend

    @backend.setter
    def backend(self, backend):
        """Sets the backend of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.


        :param backend: The backend of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: ComGithubAppscodeStashApisStashV1alpha1Backend
        """

        self._backend = backend

    @property
    def file_groups(self):
        """Gets the file_groups of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501


        :return: The file_groups of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: list[ComGithubAppscodeStashApisStashV1alpha1FileGroup]
        """
        return self._file_groups

    @file_groups.setter
    def file_groups(self, file_groups):
        """Sets the file_groups of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.


        :param file_groups: The file_groups of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: list[ComGithubAppscodeStashApisStashV1alpha1FileGroup]
        """

        self._file_groups = file_groups

    @property
    def image_pull_secrets(self):
        """Gets the image_pull_secrets of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501

        ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod  # noqa: E501

        :return: The image_pull_secrets of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: list[IoK8sApiCoreV1LocalObjectReference]
        """
        return self._image_pull_secrets

    @image_pull_secrets.setter
    def image_pull_secrets(self, image_pull_secrets):
        """Sets the image_pull_secrets of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.

        ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod  # noqa: E501

        :param image_pull_secrets: The image_pull_secrets of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: list[IoK8sApiCoreV1LocalObjectReference]
        """

        self._image_pull_secrets = image_pull_secrets

    @property
    def paused(self):
        """Gets the paused of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501

        Indicates that the Restic is paused from taking backup. Default value is 'false'  # noqa: E501

        :return: The paused of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: bool
        """
        return self._paused

    @paused.setter
    def paused(self, paused):
        """Sets the paused of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.

        Indicates that the Restic is paused from taking backup. Default value is 'false'  # noqa: E501

        :param paused: The paused of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: bool
        """

        self._paused = paused

    @property
    def resources(self):
        """Gets the resources of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501

        Compute Resources required by the sidecar container.  # noqa: E501

        :return: The resources of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: IoK8sApiCoreV1ResourceRequirements
        """
        return self._resources

    @resources.setter
    def resources(self, resources):
        """Sets the resources of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.

        Compute Resources required by the sidecar container.  # noqa: E501

        :param resources: The resources of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: IoK8sApiCoreV1ResourceRequirements
        """

        self._resources = resources

    @property
    def retention_policies(self):
        """Gets the retention_policies of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501


        :return: The retention_policies of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: list[ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy]
        """
        return self._retention_policies

    @retention_policies.setter
    def retention_policies(self, retention_policies):
        """Sets the retention_policies of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.


        :param retention_policies: The retention_policies of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: list[ComGithubAppscodeStashApisStashV1alpha1RetentionPolicy]
        """

        self._retention_policies = retention_policies

    @property
    def schedule(self):
        """Gets the schedule of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501


        :return: The schedule of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: str
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """Sets the schedule of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.


        :param schedule: The schedule of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: str
        """

        self._schedule = schedule

    @property
    def selector(self):
        """Gets the selector of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501


        :return: The selector of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: IoK8sApimachineryPkgApisMetaV1LabelSelector
        """
        return self._selector

    @selector.setter
    def selector(self, selector):
        """Sets the selector of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.


        :param selector: The selector of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: IoK8sApimachineryPkgApisMetaV1LabelSelector
        """

        self._selector = selector

    @property
    def type(self):
        """Gets the type of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501

        https://github.com/appscode/stash/issues/225  # noqa: E501

        :return: The type of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.

        https://github.com/appscode/stash/issues/225  # noqa: E501

        :param type: The type of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def volume_mounts(self):
        """Gets the volume_mounts of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501

        Pod volumes to mount into the sidecar container's filesystem.  # noqa: E501

        :return: The volume_mounts of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :rtype: list[IoK8sApiCoreV1VolumeMount]
        """
        return self._volume_mounts

    @volume_mounts.setter
    def volume_mounts(self, volume_mounts):
        """Sets the volume_mounts of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.

        Pod volumes to mount into the sidecar container's filesystem.  # noqa: E501

        :param volume_mounts: The volume_mounts of this ComGithubAppscodeStashApisStashV1alpha1ResticSpec.  # noqa: E501
        :type: list[IoK8sApiCoreV1VolumeMount]
        """

        self._volume_mounts = volume_mounts

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ComGithubAppscodeStashApisStashV1alpha1ResticSpec):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
